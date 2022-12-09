# Java Design Patterns: Behavioral Part 1
[LinkedIn course](https://www.linkedin.com/learning/java-design-patterns-behavioral-part-1?u=78611978) by [Bethan Palmer](https://www.linkedin.com/learning/instructors/bethan-palmer?u=78611978)

## History
[Design Patterns: Elements of Reusable Object-Oriented Software](http://www.javier8a.com/itc/bd1/articulo.pdf) (1994) by Erich Gamma, John Vlissides, Ralph Johnson, Richard Helm

## What are behavioral design patterns?
- They are about how objects assign responsibilities between each other/how objects are connected & how they communicate & how responsibilities are assigned between them.

## Types of behavioral design patterns:
1. Class patterns (`isA` relationships)
   - how classes share responsibilities between themselves
   - they use inheritance
2. Object patterns (`hasA` relationships)
   - the most common type
   - how different object interact w/ each other
   - sometimes they help different objects work together in order to perform a task
   - sometimes they delegate requests to other objects
   - they use composition.

## Pattern 1: Chain of Responsibility
- Used when it is decided in runtime which entity handles a request.
- Passes along a request until it is handled
- Decouples the sender from the receiver
- Example use cases:
  - handling authentication
  - servlet filters for handling HTTP requests
  - context-dependent buttons in UI
- What to watch out for:
  - circular chains of requests
  - requests may never be handled
  - confusing stack traces

### Exercise 1
1. We define the abstract class `DocumentHandler` which later on will be implemented for each document type we wish to handle. This handler has a `DocumentHandler` field named `next`, indicating the next handler. This class handles the next handler, as we do not know which type the next handler might be each time.
2. We then define the other handlers, e.g. `SlideshowHandler`, `SpreadsheetHandler` and `TextDocumentHandler`. These implement a method named `openDocument()` which checks the document's extension and simply log whether they can handle this document or not.
3. We also create the `Client` class, which handles the main function. In the following line:
```
DocumentHandler chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
```
we define the successor chain starting with a slideshow handler and ending with a text document handler. We then can add another handler if we need to handle another type of documents as the argument of the innermost constructor (here, `TextDocumentHandler`), after we implement said handler. 

### Challenge 1
Implement request handling using the same design pattern.

## Pattern 2: The Command Pattern
 - Useful when it is unknown *what is requested* or *what is receiving the request*.
 - Encapsulate a request inside an object
 - Decouples the object that invokes the command from the object that knows how to handle it.
 - Useful for commands we wish to perform later on, e.g.:
   - Support undo/redo functionality
   - Queueing/logging requests to be performed at different times

### Exercise 2
Goal: Decouple BE functionality from FE (button clicking)

Starting:
 - GUI class: hold simple information for UI, also holds the main method.
 - Button (with a `click()` method) - the invoker
 - Document (will hold the functionality of printing/saving documents) - the receiver.

We then add the `Command` interface and its implementations for `SaveCommand` and `PrintCommand`.

### Challenge 2
Implement order handling using the same design pattern.

## Pattern 3: Interpreter Pattern
Use Cases:
 - write custom regular expressions
 - write custom compiler
 - translate human languages
 - parse SQL
 - create a simple calculator
Key points:
 - express a recurring problem as a sentence & interpret it
 - define grammar
 - build an abstract syntax tree
Components:
1. `Context` (what we handle, e.g. a `String`)
2. Abstract `Expression` (defines a method `interpret(context)`)

   Two possible implementations:
   1. Terminal expression (the last time `interpret()` gets called)
   2. Non terminal expression (calls the interpret method, which alters the context and then it passes it onto another expression until terminal expression)
3. `Client` which creates instances of expression to interpret.

Positives:
- easy to extend/implement the grammar
- works best with simple grammar (complex ones new a new expression class per new rule)

### Exercise 3
Implement a language interpreter which can also rename variables to meet Java conventions.

We create the `Expression` interface which defines the `interpret()` method & its implementations: `NameNotPrimitiveType`, `FirstLetterIsLowerCase`, `FirstLetterNotUnderscore`, which all handle their corresponding cases by altering the context. We can test this in the `Main` class.

Therefore we check that firstly the variable name does not begin with `_`, then that it doesn't start with a capital letter and lastly that it's not a primitive type.

### Challenge 3
Implement a language interpreter which checks sentences for a capital first letter, no repeated words and that verifies that they end with a period.

## Pattern 4: Iterator Pattern
Example uses: `Collections` class with `forEach` loops

Benefits: agnostic as to the type of collection, as long as it implements `Collection`.

The `iterator` is a seperate object which is responsible for moving along the list, keeping track of which elements have been traversed already.

### Exercise 4
Create an iterator in order to print only the items that are in stock.