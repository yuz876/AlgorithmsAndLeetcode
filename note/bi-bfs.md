
初始化forward_quque forward_set(VISITED) , 加入起点
初始化backward_quque backward_set , 加入终点
distance = 0

while forward_quque backward_quque 都非空：
    distance += 1
    for all nodes in forward_queue:
        扩展出下一层的点放入forward_queue 和forward_set里面
        if 碰到了backward_set里面的点：
            return distance
    
    distance += 1
    for all nodes in backward_queue:
        扩展出下一层的点放入backward_queue 和backward_set里面
        if 碰到了forward_set里面的点：
            return distance
return not found



