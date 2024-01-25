# Java Collections

## List Data Structures:

### 1. List:

A list is an ordered collection that allows duplicate elements. Different implementations offer various features:

#### ArrayList
- **Description**: A dynamic array offering fast random access and efficient iteration. It's a resizable-array implementation of the List interface.
- **Unique Features**:
  - Fast random access.
  - Efficient resizing.
- **Ideal Use Cases**:
  - When frequent read operations are required.
  - When additions and deletions are infrequent and mostly at the end of the list.

  
#### LinkedList
- **Description**: A doubly-linked list optimized for efficient insertions and deletions. It implements the List and Deque interfaces, allowing it to be used as both a list and a queue.
- **Unique Features**:
  - Efficient Insertions/Deletions: More efficient for insertions and deletions, as it doesn't require shifting elements.

- **Ideal Use Cases**:
  - When frequent insertions and deletions are involved, especially at the beginning or in the middle of the list.
  - When the list size is large and changes frequently, especially if the changes are not just at the end but also at the beginning or in the middle.

#### Vector
- **Description**: Similar to ArrayList, but with synchronized methods to ensure thread safety. However, due to its synchronized nature, it might have performance drawbacks compared to ArrayList.
- **Unique Features**:
  - Synchronized methods for thread safety.
  - Grows by doubling the size of its array, which can be memory intensive.
- **Ideal Use Cases**:
  - In multi-threaded environments where you need thread safety without explicit synchronization.
  - When you're okay with the performance trade-off for thread safety.
- **Stack**: This class extends Vector and provides LIFO (Last-In-First-Out) behavior. It's considered deprecated in favor of more robust alternatives like Deque.

- **CopyOnWriteArrayList**: A thread-safe variant of ArrayList. It's suitable for concurrent access, especially in scenarios with infrequent modifications but frequent iterations or reads.

#### Stack
- **Description**: Extends Vector to provide a LIFO (Last-In-First-Out) stack.
- **Unique Features**:
  - Provides methods like `push()`, `pop()`, `peek()`, and `empty()`.
  - Inherits from Vector, thus having synchronized methods.
- **Ideal Use Cases**:
  - When you need a simple LIFO data structure.
  - Note: It's considered deprecated in favor of Deque implementations.

#### CopyOnWriteArrayList
- **Description**: A thread-safe variant of ArrayList, suitable for concurrent access with infrequent modifications.
- **Unique Features**:
  - Thread-safe without explicit synchronization.
  - Every mutative operation copies the underlying array, ensuring no interference among threads.
- **Ideal Use Cases**:
  - In multi-threaded environments where reads are much more frequent than writes.
  - Where thread safety is a priority, and you can afford the cost of copying the list on each write operation.

  
---

### 2. Set

[//]: # (   HashSet)

[//]: # (   LinkedHashSet)

[//]: # (   TreeSet)

[//]: # (   EnumSet)

[//]: # (   ConcurrentSkipListSet)

### 3. Map

[//]: # (   HashMap)

[//]: # (   LinkedHashMap)

[//]: # (   TreeMap)

[//]: # (   Hashtable)

[//]: # (   EnumMap)

[//]: # (   ConcurrentHashMap)

[//]: # (   WeakHashMap)

[//]: # (   IdentityHashMap)

### 4. Queue

[//]: # (   LinkedList &#40;also a List&#41;)

[//]: # (   PriorityQueue)

[//]: # (   ArrayDeque &#40;also a Deque&#41;)

[//]: # (   ConcurrentLinkedQueue)

[//]: # (   LinkedBlockingQueue)

[//]: # (   PriorityBlockingQueue)

### 5. Stack

[//]: # (   Stack &#40;though it’s recommended to use Deque instead&#41;)

[//]: # (   ArrayDeque &#40;recommended as a stack replacement&#41;)

### 6. Deque (Double Ended Queue)

[//]: # (   ArrayDeque)

[//]: # (   LinkedList)

[//]: # (   LinkedBlockingDeque)

[//]: # (   ConcurrentLinkedDeque)

### 7. PriorityQueue

[//]: # (   PriorityQueue)

[//]: # (   PriorityBlockingQueue)

### 8. LinkedHashMap

[//]: # (LinkedHashMap)

### 9. TreeSet / TreeMap

[//]: # (   TreeSet)

[//]: # (   TreeMap)

### 10. Concurrent Collections

[//]: # (    ConcurrentHashMap)

[//]: # (    ConcurrentLinkedQueue)

[//]: # (    ConcurrentLinkedDeque)

[//]: # (    ConcurrentSkipListSet)

[//]: # (    ConcurrentSkipListMap)

[//]: # (    CopyOnWriteArrayList)

[//]: # (    CopyOnWriteArraySet)

### 11. WeakHashMap

[//]: # (    WeakHashMap)

### 12. IdentityHashMap

[//]: # (    IdentityHashMap)