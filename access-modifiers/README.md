# Access Modifiers in Java

Access modifiers in Java define the visibility and accessibility of classes, methods, and variables. Here is a detailed explanation of each access modifier with code examples and a summary table for quick reference.

---

## **Access Modifiers Overview**

| **Modifier**   | **Same Class** | **Same Package** | **Subclass (Different Package)** | **Non-Subclass (Different Package)** |
|-----------------|----------------|------------------|-----------------------------------|---------------------------------------|
| **Public**      | ✅              | ✅                | ✅                                 | ✅                                     |
| **Protected**   | ✅              | ✅                | ✅                                 | ❌                                     |
| **Default**     | ✅              | ✅                | ❌                                 | ❌                                     |
| **Private**     | ✅              | ❌                | ❌                                 | ❌                                     |

---

For classes, public classes are to be used everywhere.

But if they are default then they are visible only in that package .

And protected and private are only visible in that class only.

