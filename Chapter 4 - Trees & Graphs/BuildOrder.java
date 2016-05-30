import java.util.*;

public class BuildOrder{

	public static Project[] findbuildOrder(String[] projects, String[][] dependencies){
		Graph graph = buildGraph(project, dependencies);
		return orderProjects(graph.getNodes());
	}

	public static Graph buildGraph(String[] projects, String[][] dependencies){
		Graph graph = new Graph();
		for(String project: projects)
			graph.createNode(project);

		for(String[] dependency : dependencies){
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first,second);
		}

		return graph;
	}

	static Project[] orderProjects(ArrayList<Project> projects){
		Project[] order = new Project[projects.size()];

		int endOfList = addNonDependent(order,projects,0);

		int toBeProcessed = 0;
		while(toBeProcessed<order.length){
			Project current = order[toBeProcessed];

			if(current==null)
				return null;

			ArrayList<Project> children = current.getChildren();
			for(Project child : children)
				child.decrementDependencies();

			endOfList = addNonDependent(order,children,endOfList);
		}

		return order;
	}

	static int addNonDependent(Project[] order, ArrayList<Project> projects, int offset){
		for(Project project : projects){
			if(project.getNumberDependencies()==0){
				order[offset] = projects;
				offset++;
			}
		}
		return offset;
	}

	static String[] buildOrderWrapper(String[] projects, String[][] dependencies){
		Project[] buildOrder = findbuildOrder(projects,dependencies);
		if(buildOrder==null)
			return null;
		String[] buildOrderString = convertToStringList(buildOrder);
		return buildOrderString;
	}

	static String[] convertToStringList(Project[] projects){
		String[] buildOrder = new String[projects.length];
		for(int i=0; i<projects.length; i++)
			buildOrder[i] = projects[i].getName();
		return buildOrder;
	}

	public static void main(String [] args){
		String[] projects = {"a","b","c","d","e","f","g","h","i","j",};
		String[] dependencies = {
			{"a","b"},
			{"b","c"},
			{"a","c"},
			{"a","c"},
			{"d","e"},
			{"b","d"},
			{"e","f"},
			{"a","f"},
			{"h","i"},
			{"h","j"},
			{"i","j"},
			{"g","j"}
		};
	}

}

class Project{
	private ArrayList<Project> children = new ArrayList<Project>();
	private HashMap<String,Project> map = new HashMap<String,Project>();
	private String name;
	private int dependencies = 0;

	Project(String n){
		name = n;
	}

	void addNeighbor(Project node){
		if(!map.containsKey(node.getName())){
			children.add(node);
			map.put(node.getName(), node);
			node.incrementDependencies();
		}
	}

	void incrementDependencies(){
		dependencies++;
	}

	void decrementDependencies(){
		dependencies--;
	}

	String getName(){
		return name;
	}

	ArrayList<Project> getChildren(){
		return children;
	}

	int getNumberDependencies(){
		return dependencies;
	}
}

class Graph{
	private ArrayList<Project> nodes = new ArrayList<Project>();
	private HashMap<String,Project> map = new HashMap<String,Project>();

	Project getOrCreateNode(String name){
		if(!map.containsKey(name)){
			Project node = new Project(name);
			nodes.add(node);
			map.put(name, node);
		}
		return map.get(name);
	}

	void addEdge(String startName, String endName){
		Project start = getOrCreateNode(startName);
		Project end = getOrCreateNode(endName);
		start.addNeighbor(end);
	}

	ArrayList<Project> getNodes(){
		return nodes;
	}
}