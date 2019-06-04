from heapq import heappop, heappush, heapify 

def sort_k_messed_array(arr, k):
    heap = arr[:k + 1] 

    # using heapify to convert list 
    # into heap(or min heap) 
    heapify(heap) 

    target_index = 0
    for rem_elmnts_index in range(k + 1, n): 
        arr[target_index] = heappop(heap) 
        heappush(heap, arr[rem_elmnts_index]) 
        target_index += 1

    while heap: 
        arr[target_index] = heappop(heap) 
        target_index += 1


