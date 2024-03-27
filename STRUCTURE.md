# Java Collections

### 1. List

<details>
<summary>More info</summary>

A list is an ordered collection that allows duplicate elements. Different implementations offer various features:

<details>
<summary><strong>ArrayList</strong></summary>

- **Description**: A dynamic array offering fast random access and efficient iteration. It's a resizable-array implementation of the List interface.


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
    - Efficient Insertions/Deletions: More efficient for insertions and deletions, as it doesn't require shifting elements.


- **Ideal Use Cases**:
    - When frequent insertions and deletions are involved, especially at the beginning or in the middle of the list.
    - When the list size is large and changes frequently, especially if the changes are not just at the end but also at the beginning or in the middle.
</details>

<details>
<summary><strong>Vector</strong></summary>

- **Description**: A collection similar to ArrayList that ensures thread safety by synchronizing each of its methods. This built-in synchronization mechanism can introduce performance overhead, particularly in highly concurrent scenarios due to contention among threads.


- **Unique Features**:
  - Method-level synchronization for thread safety.
  - Automatic resizing by doubling the array size, which may lead to increased memory use.


- **Ideal Use Cases**:
  - Suitable for applications with moderate concurrency where method-level thread safety is required without the hassle of external synchronization.
  - Considered for legacy systems where `Vector` is already prevalent, although modern alternatives like `Collections.synchronizedList` or `CopyOnWriteArrayList` might offer better performance or concurrency handling in specific scenarios.

</details>

<details>
<summary><strong>Stack</strong></summary>

- **Description**: A Last-In-First-Out (LIFO) stack implementation based on Vector. It provides synchronized methods for push, pop, peek, and checking if the stack is empty.
- **Unique Features**:
    - Synchronized stack operations.
- **Ideal Use Cases**:
    - Previously used for simple LIFO data structures in multithreaded environments.
    - **Note**: While not officially marked as **deprecated**, Stack is considered legacy and less efficient compared to modern alternatives due to its synchronized nature and reliance on Vector. **It's recommended to use ArrayDeque for stack-like behavior in new development for better performance and flexibility.**
</details>

<details>
<summary><strong>CopyOnWriteArrayList</strong></summary>

- **Description**:  An efficient implementation for read-heavy, write-sparse scenarios, providing thread safety by creating a new underlying array upon each modification. This approach allows for lock-free read operations, significantly reducing contention compared to other synchronized collections.


- **Unique Features**:
    - Lock-free read operations ensure high concurrency without read-write interference.
    - Writes involve copying the entire underlying array, trading off write performance for enhanced read efficiency and thread safety.

  
- **Ideal Use Cases**:
  - Best for environments with more reading than writing, where quick reads justify slower writes. 
  - Ideal for lists like event listeners, rarely changed but often accessed, avoiding errors during iteration.
</details>
</details>

---

### 2. Set

<details>
<summary>More info</summary>

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

---

### 3. Queue and Deque

<details>
<summary>More info</summary>

A **Queue** is a collection designed for holding elements prior to processing, adhering to a FIFO (First-In-First-Out) principle. 

A **Deque** (Double-Ended Queue) extends the Queue interface, supporting element insertion and removal at both ends, thus facilitating both FIFO and LIFO (Last-In-First-Out) operations. 

Different implementations offer various features:

<details>
<summary><strong>More info</strong></summary>

- **Description**: LinkedList is a Java collection class that implements the Deque interface in addition to the List interface. This dual implementation makes it a versatile double-ended queue, enabling elements to be added or removed
  from both the front and the back. This capability makes it extremely versatile for a range of data handling scenarios, especially where FIFO (First-In-First-Out) and LIFO (Last-In-First-Out) operations are needed.


**Unique Features**:
  - Enables efficient insertion and removal of elements at both the beginning and the end.
  - Can function as a queue (FIFO) and as a stack (LIFO), thanks to its Deque implementation.
  - Unlike some Deque implementations, LinkedList allows null elements, providing flexibility for certain use cases.


**Ideal Use Cases**:
  - Ideal for applications that require dynamic modification of data with frequent additions or removals from either end.
  - Perfect for scenarios that necessitate queue functionality along with the added flexibility of stack operations, such as task scheduling and undo functionalities.
</details>







<details>
<summary><strong>ArrayDeque</strong></summary>

- **Description**: A resizable-array implementation of the Deque interface, offering a flexible array that grows as needed. It does not support concurrent access by multiple threads.

- **Unique Features**:
  - More memory-efficient than LinkedList when used as a stack.
  - Does not allow null elements.

- **Ideal Use Cases**:
  - Suitable for stack (LIFO) or queue (FIFO) usages where memory efficiency is important and concurrent modifications are not expected.
</details>

<details>
<summary><strong>PriorityQueue</strong></summary>

- **Description**: An unbounded priority queue based on a priority heap, where elements are ordered based on their natural ordering or by a Comparator provided at construction time.

- **Unique Features**:
  - Allows for elements to be processed based on priority rather than the order they were added.
  - Does not permit null elements.

- **Ideal Use Cases**:
  - When elements need to be processed in a priority order rather than FIFO.
</details>

<details>
<summary><strong>LinkedBlockingQueue</strong></summary>

- **Description**: An optionally-bounded blocking queue based on linked nodes, suitable for producer-consumer scenarios.

- **Unique Features**:
  - Supports concurrent access and is thread-safe.
  - Blocks when attempting to add to a full queue or take from an empty one.

- **Ideal Use Cases**:
  - Highly suitable for producer-consumer patterns where you need to safely pass elements between threads.
</details>

<details>
<summary><strong>ConcurrentLinkedQueue</strong></summary>

- **Description**: An unbounded, thread-safe queue based on linked nodes, following FIFO. It supports concurrent access by multiple threads.

- **Unique Features**:
  - Lock-free and thread-safe, supporting high concurrency.
  - Iteration is weakly consistent, not reflecting the queue's state during iteration.

- **Ideal Use Cases**:
  - When high concurrency is required, and you need a non-blocking queue.
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

### 6. Deque (Double Ended Queue)
[//]: # (   ArrayDeque)
[//]: # (   LinkedList)
[//]: # (   LinkedBlockingDeque)
[//]: # (   ConcurrentLinkedDeque)

### 10. Concurrent Collections
[//]: # (    ConcurrentSkipListMap)
[//]: # (    CopyOnWriteArraySet)
