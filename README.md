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
*Used when it is decided in runtime which entity handles a request.*
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

## Challenge 1