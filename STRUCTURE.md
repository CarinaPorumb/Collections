# Java Collections

### 1. List

<details>
<summary>Click to expand</summary>

A list is an ordered collection that allows duplicate elements. Different implementations offer various features:

<details>
<summary><strong>ArrayList</strong></summary>

- **Description**: A dynamic array offering fast random access and efficient iteration. It's a resizable-array
  implementation of the List interface.
- **Unique Features**:
    - Fast random access.
    - Efficient resizing.
- **Ideal Use Cases**:
    - When frequent read operations are required.
    - When additions and deletions are infrequent and mostly at the end of the list.

</details>

<details>
<summary><strong>LinkedList</strong></summary>

- **Description**: A doubly-linked list optimized for efficient insertions and deletions. It implements the List and
  Deque interfaces, allowing it to be used as both a list and a queue.
- **Unique Features**:
    - Efficient Insertions/Deletions: More efficient for insertions and deletions, as it doesn't require shifting
      elements.
- **Ideal Use Cases**:
    - When frequent insertions and deletions are involved, especially at the beginning or in the middle of the list.
    - When the list size is large and changes frequently, especially if the changes are not just at the end but also at
      the beginning or in the middle.

</details>

<details>
<summary><strong>Vector</strong></summary>

- **Description**: Similar to ArrayList, but with synchronized methods to ensure thread safety. However, due to its
  synchronized nature, it might have performance drawbacks compared to ArrayList.
- **Unique Features**:
    - Synchronized methods for thread safety.
    - Grows by doubling the size of its array, which can be memory intensive.
- **Ideal Use Cases**:
    - In multithreaded environments where you need thread safety without explicit synchronization.
    - When you're okay with the performance trade-off for thread safety.
</details>

<details>
<summary><strong>Stack</strong></summary>

- **Description**: Extends Vector to provide a LIFO (Last-In-First-Out) stack.
- **Unique Features**:
    - Provides methods like `push()`, `pop()`, `peek()`, and `empty()`.
    - Inherits from Vector, thus having synchronized methods.
- **Ideal Use Cases**:
    - When you need a simple LIFO data structure.
    - Note: It's considered deprecated in favor of Deque implementations.
</details>

<details>
<summary><strong>CopyOnWriteArrayList</strong></summary>

- **Description**: A thread-safe variant of ArrayList, suitable for concurrent access with infrequent modifications.
- **Unique Features**:
    - Thread-safe without explicit synchronization.
    - Every mutative operation copies the underlying array, ensuring no interference among threads.
- **Ideal Use Cases**:
    - In multithreaded environments where reads are much more frequent than writes.
    - Where thread safety is a priority, and you can afford the cost of copying the list on each write operation.

</details>
</details>

---

### 2. Set

<details>
<summary>Click to expand</summary>

A Set is a collection that does not allow duplicate elements. This restriction is enforced by the constructor and the
add method, which internally compare new elements against those already in the collection to ensure uniqueness.
Different implementations offer various features:

<details>
<summary><strong>HashSet</strong></summary>

- **Description**: A HashSet is an implementation of the Set interface in Java that does not retain the insertion order
  of elements. It offers highly efficient performance for basic operations such as add, remove, and contains, typically
  operating in constant time.


- **Unique Features**:
    - Allows one null element.
    - Does not maintain any order of elements.


- **Ideal Use Cases**:
    - When you need quick lookups.
    - When order is not important.

</details>

<details>
<summary><strong>LinkedHashSet</strong></summary>

- **Description**: A LinkedHashSet is a Set implementation that combines a hash table with a linked list to store
  elements. While ensuring that each element is unique (no duplicates allowed), it also maintains the order of elements
  based on when they were inserted. This ordering is consistent even if an existing element is re-inserted, as the
  position in the iteration sequence remains unchanged. This dual structure allows LinkedHashSet to offer both the
  efficient performance of a hash set for operations like add, remove, and contains, and the predictable iteration order
  of a linked list.


- **Unique Features**:
    - Maintains a doubly-linked list across all elements.
    - Iteration order is predictable (the order in which elements were inserted).


- **Ideal Use Cases**:
    - When insertion-order iteration is required.

</details>

<details>
<summary><strong>TreeSet</strong></summary>

- **Description**: A TreeSet is a collection that stores unique elements in a sorted order. It implements the
  NavigableSet
  interface and uses a TreeMap for storage. EBy default, elements are sorted according to their natural ordering. To
  sort
  the elements in a different order, a `Comparator` must be provided at the time of the set's creation.


- **Unique Features**:
    - Provides fast performance for adding, removing, and checking elements.
    - Elements are automatically sorted according to their natural ordering or a specified Comparator, ensuring a
      consistent
      order.


- **Ideal Use Cases**:
    - When sorted order of elements is required.
    - Beneficial for applications requiring frequent execution of range
      operations (`floor`, `ceiling`, `higher`, `lower`).

</details>

<details>
<summary><strong>EnumSet</strong></summary>

- **Description**: Is a highly efficient collection designed specifically for use with enumeration types. It requires
  that
  all elements belong to the same enum type, which is determined when the set is created.


- **Unique Features**:
    - Offers outstanding efficiency and compactness, making it much faster and less memory-intensive than other Set
      implementations when dealing with enums.
    - Utilizes a bit vector representation for enum constants, enabling this high performance and efficiency.


- **Ideal Use Cases**:
    - When working exclusively with enum types.
    - Best suited for cases where you need to group enum constants together.

</details>

<details>
<summary><strong>ConcurrentSkipListSet</strong></summary>

- **Description**: A ConcurrentSkipListSet is a thread-safe version of a NavigableSet that uses a ConcurrentSkipListMap
  for storage. This set maintains its elements in sorted order, either by their natural ordering or using a custom
  Comparator defined when the set is created.


- **Unique Features**:
    - Provides thread safety, allowing concurrent access by multiple threads without the need for external
      synchronization and without blocking.
    - Ensures efficient performance for adding, removing, and checking for elements. These operations are designed to be
      fast even as the set grows.


- **Ideal Use Cases**:
    - Perfect for applications requiring concurrent access to a sorted set by multiple threads, ensuring data integrity
      and thread safety.
    - Useful when the order of elements matters, and you need quick access to them, making it ideal for real-time data
      processing or concurrent programming scenarios where data ordering and thread safety are priorities.

</details>
</details>

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

### 9. TreeMap

[//]: # (   TreeMap)

### 10. Concurrent Collections

[//]: # (    ConcurrentHashMap)

[//]: # (    ConcurrentLinkedQueue)

[//]: # (    ConcurrentLinkedDeque)

[//]: # (    ConcurrentSkipListMap)

[//]: # (    CopyOnWriteArrayList)

[//]: # (    CopyOnWriteArraySet)

### 11. WeakHashMap

[//]: # (    WeakHashMap)

### 12. IdentityHashMap

[//]: # (    IdentityHashMap)