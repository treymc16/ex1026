package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
   private <T extends Object> void extractedMethod(List<T> o, String p) {
	   if(o instanceof Edge) {
		   for (T obj : o) {
				if (((Edge) obj).contains(p))
					System.out.println(obj);
			}
	   }
	   else if(o instanceof Node) {
		   for (T obj : o) {
				if (((Node) obj).contains(p))
					System.out.println(obj);
			}
	   }
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}