package Homework5;

import java.util.*;
public class Graph
    {
        int V; //Number of Vertices
         
        LinkedList<Integer>[] adj; // adjacency lists
         
        //Constructor
        Graph(int V)
        {
            this.V = V;
            adj = new LinkedList[V];
             
            for (int i = 0; i < adj.length; i++)
                adj[i] = new LinkedList<Integer>();
             
        }
         
        //To add an edge to graph
        public void addEdge(int v, int w)
        {
            adj[v].add(w); // Add w to v’s list.
        }
         
        // prints all not yet visited vertices reachable from s
        public void DFS(int s)
        {
            // Initially mark all vertices as not visited
            Vector<Boolean> visited = new Vector<Boolean>(V);
            for (int i = 0; i < V; i++)
                visited.add(false);
     
            // Create a stack for DFS
            Stack<Integer> stack = new Stack<>();
             
            // Push the current source node
            stack.push(s);
             
            while(stack.empty() == false)
            {
                // Pop a vertex from stack and print it
                s = stack.peek();
                stack.pop();
                 
                // Stack may contain same vertex twice. So
                // we need to print the popped item only
                // if it is not visited.
                if(visited.get(s) == false)
                {
                    switch (s) {
                        case 0: System.out.print("A "); break;
                        case 1: System.out.print("B "); break;
                        case 2: System.out.print("C "); break;
                        case 3: System.out.print("D "); break;
                        case 4: System.out.print("E "); break;
                        case 5: System.out.print("F "); break;
                        case 6: System.out.print("G "); break;
                        case 7: System.out.print("H "); break;
                        case 8: System.out.print("I "); break;
                    }
                    
                    visited.set(s, true);
                }
                 
                // Get all adjacent vertices of the popped vertex s
                // If a adjacent has not been visited, then push it
                // to the stack.
                Iterator<Integer> itr = adj[s].iterator();
                 
                while (itr.hasNext())
                {
                    int v = itr.next();
                    if(!visited.get(v))
                        stack.push(v);
                }
                 
            }
        }

        // prints BFS traversal from a given source s
        public void BFS(int s)
        {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];
    
            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();
    
            // Mark the current node as visited and enqueue it
            visited[s]=true;
            queue.add(s);
    
            while (queue.size() != 0)
            {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                switch (s) {
                    case 0: System.out.print("A "); break;
                    case 1: System.out.print("B "); break;
                    case 2: System.out.print("C "); break;
                    case 3: System.out.print("D "); break;
                    case 4: System.out.print("E "); break;
                    case 5: System.out.print("F "); break;
                    case 6: System.out.print("G "); break;
                    case 7: System.out.print("H "); break;
                    case 8: System.out.print("I "); break;
                }
    
                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }