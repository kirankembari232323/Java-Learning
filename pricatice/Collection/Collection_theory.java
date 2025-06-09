In Java, a "collection" is a framework that provides a standardized way to group and manipulate objects. It's essentially a container that holds multiple elements, allowing for efficient storage, retrieval, and modification of data. The Java Collections Framework is a set of interfaces and classes that implement commonly used data structures.

Key aspects include:
1)Interfaces:
Define the basic operations for different types of collections, such as Collection, List, Set, and Map.

2)Implementations:
Concrete classes that implement these interfaces, such as ArrayList, HashSet, and HashMap.

3)Generics:
Collections are type-safe, using generics to ensure that only objects of the specified type can be added.

4)Utility methods:
The Collections class provides static methods for common operations like sorting, searching, and synchronizing collections.

5) Common Collection Types:
List:
Ordered collections that allow duplicate elements (e.g., ArrayList, LinkedList).
Set:
Unordered collections that do not allow duplicate elements (e.g., HashSet, TreeSet).
Map:
Stores data in key-value pairs, where keys are unique (e.g., HashMap, TreeMap).
Queue:
Designed for holding elements in a specific order for processing (e.g., PriorityQueue, LinkedList).

6)Key Differences:
Collection vs. Collections:
Collection is an interface, while Collections is a utility class with static methods for operating on collections.
View Collections:
Collections that rely on a backing collection for storing elements, and changes made to the view are reflected in the backing collection.


We  have array then WHy colllection

- array has fixed size;
-  array can stored only homogenous data
- collection can increase or decrease dynamically
- collection can hold both homogenous & heterogenous data


- array can stored both premitive and objects
-collection can only stored objects not premitives



collection - root

List
     - allowes duplicates, ordered, maintain insertion order, indexed

     - ArrayList, LinkedList

Set
    not allow duplicates, no ordered, 	

    hashset - random ordere
    Linkedhashset - insertion ordered
    Treeset - NSO-ASc


Map
   HashMap - random ordered
   LinkedHashmap - insertion ordered
   TreeMap - Asc