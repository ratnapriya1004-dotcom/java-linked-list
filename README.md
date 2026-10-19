# Simple User-Defined Linked Lists in Java

This project contains three beginner-friendly generic linked-list classes:
- `SinglyLinkedList<T>`
- `DoublyLinkedList<T>`
- `CircularLinkedList<T>`

Each class implements `length()`, `addFirst(data)`, `addLast(data)`, `addAt(index, data)`,
`removeFirst()`, `removeLast()`, `removeAt(index)`, and `traverse()`.

Indexes start at 0. Generics (`<T>`) allow the list to store any Java reference type,
including objects that represent arrays, lists, maps, or custom data structures.
Use `Object` if you want to mix types in one list.

## Run
Place the `.java` files in a Java project's `src` folder and run `Main.java`.

## Upload to GitHub
1. Create a new GitHub repository and select **Public**.
2. Copy these files into the repository folder.
3. Open a terminal in that folder and run:

```bash
git init
git add .
git commit -m "Add simple generic linked list implementations"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/generic-linked-lists-java.git
git push -u origin main
```

Replace `YOUR-USERNAME` with your GitHub username. Authenticate when prompted.
Do not put passwords or access tokens in source code.
