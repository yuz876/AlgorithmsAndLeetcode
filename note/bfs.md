# BFS template

```py
def bfs():
    queue = collections.deque()
    queue.append(root)
    
    queue = collections.deque([root])
    queue = collections.deque([root1, root2]) 
    visited_and_distance = {root1: 0, root2: 0}

    while  queue:
        currnode = queue.popleft()
        for child/neighbor in currnode.getAllNeighbors():
            if neighbor in visited:
                continue
            queue.apeend(neighbor)
            visited_and_distance[neighbor] =  visited_and_distance[currnode] + 1
            
    
```

```java
public bfs(){
    Deque<Node> queue = new ArrayDeque<Node>();
    HashMap<Node, Integer> visitedAndDistance = new HashMap<Node, Integer>();
    queue.add(root1);
    queue.add(root2);
    visitedAndDistance.put(root1, 0);
    visitedAndDistance.put(root2, 0);

    while (!queue.isEmpty){
        Node currNode = queue.poll();
        for (Node neighbor: currNode.getAllNeighbors()){
            if visitedAndDistance.containsKey(neighbor){
                continue;
            }
            queue.add(neighbor);
            visitedAndDistance[neighbor] = visitedAndDistance[currNode] + 1;

        }

    }



}
```
