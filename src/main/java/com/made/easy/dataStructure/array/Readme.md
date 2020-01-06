| Operation | Static Array | Dynamic Array |
|---|---|---|
| Access| O(1) | O(1) |
| Search | O(n)| O(n) |
| Insertion | N/A | O(n) |
| Appending | N/A | O(n) |
| Deletion | N/A| O(n) |

#### Strengths:
* Fast Lookups: Just like arrays, retrieving the element at a given index takes o(1) times.
* Variable sizes: You can add as many items as you want, and synamic array will expand to hokd them.
* Cache-friendly: Just like arrays, dynamic arrays place items right next to each other in memory, making efficient use of caches.


##### Weaknesses:
* Slow worst-case appends: Usually, adding a new element at the end of the dynamic array takes O(1) time. 
                           But if the dynamic array doesn't have any room for the new item, it'll need to expand, which takes O(n)time. 
                           
* Costly inserts and deletes: Just like arrays, elements are stored adjacent to each other. So adding or removing an item in the middle of the array requires "scooting over" other elements, which takes O(n) time.                           