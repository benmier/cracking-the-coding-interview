import java.util.*;

public class RouteBetweenNodes{

	public static void main(String [] args){
		Graph g = createNewGraph();
		Node[] n = g.getNodes();
		Node start = n[3];
		Node end = n[5];
		System.out.println(search(g,start,end));
	}

	public static Graph createNewGraph(){
		Graph g = new Graph();
		Node[] temp = new Node[6];

		temp[0] = new Node("a",3);
		temp[1] = new Node("b",0);
		temp[2] = new Node("c",0);
		temp[3] = new Node("d",1);
		temp[4] = new Node("e",1);
		temp[5] = new Node("f",0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);

		for(int i=0; i<6; i++){
			g.addNode(temp[i]);
			// System.out.println("Added "+g.getNodes()[i].getVertex());
			Node[] adjs = g.getNodes()[i].getAdjacent();
			for(int j=0; j<adjs.length; j++){
				// System.out.println(" Adjacent: "+adjs[j].getVertex());
			}
		}
		
		return g;
	}

	public static boolean search(Graph g, Node start, Node end){
		if(start==end)
			return true;
		LinkedList<Node> queue = new LinkedList<Node>();
		start.marked = true;
		end.marked = true;
		queue.add(start);
		queue.add(end);
		while(!queue.isEmpty()){
			Node r = queue.remove();
			Node s = queue.remove();
			Node[] adjacentR = r.getAdjacent();
			Node[] adjacentS = s.getAdjacent();
			int longest = adjacentR.length<adjacentS.length ? adjacentS.length : adjacentR.length;
			for(int i=0; i<longest; i++){
				if(!adjacentR[i].marked){
					if(adjs[i].getVertex()==end.getVertex())
						return true;
					adjs[i].marked = true;
					queue.add(adjs[i]);
				}
			}
		}
		return false;
	}
}