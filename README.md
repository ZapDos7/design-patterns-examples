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

### Challenge 4
Create an iterator in order to print the names of the employees.

## Pattern 5: Mediator Pattern
Loosely coupled objects communicate through the mediator.

### Exercise 5
Given the existing implementation for the e-commerce site, implement the mediator pattern in order to introduce loose coupling onto the app. At the beginning, we notice that there is a circular dependency, as the `ECommerceSite` has a `Customer` field and vice versa.

How we do this: we implement the `Mediator` class containing a field for each object in our app (`Customer`, `ECommerceSite` & `Driver`). We there create the method `buy()`. We also decouple the existing classes. We also alter the `Main` class accordingly, using the `Mediator`'s method.

### Challenge 5
Simplify the airport application using the Mediator Pattern in order to decouple the objects and ameliorate the code.

## Pattern 6: Memento Pattern

Without breaking the principle of encapsulation, we wish to retain & externalize the previous state of an object in order to implement e.g. the undo functionality.

Terms:
 - Originator: the object whose states we wish to retain
 - Caretaker: the object changing the state of the originator
 - Memento: the object between the two which handles the state change

Notes:
 - If the originator contains a lot of data, this pattern increases the memory usage (so it is might be best to omit it)

 ### Exercise 6
 Goal: Add `save` and `undo` operations onto a document handling app.

 Beginning: The `TextDocument` which `write`s and `print`s the text and the `DocumentViewer` class which also contains the `main` method.

 Solution: We add the `Memento` class which contains the `state` field, we add a `Memento` field to the `TextDocument` class, and we also add there the methods to `save()` and `undo()` which utilize the pattern. We update the `main` method accordingly.

 ### Challenge 6
 Similarly, implement the memento pattern in order to handle the calculator app state.

 # Java Design Patterns: Behavioral Part 2
[LinkedIn course](https://www.linkedin.com/learning/java-design-patterns-behavioral-part-2?u=78611978) by [Bethan Palmer](https://www.linkedin.com/learning/instructors/bethan-palmer?u=78611978)

## Pattern 7: The Observer Pattern
Useful in OOP projects where many classes need to interact with each other without being tightly coupled; when many classes need to be notified of changes on another object.

Elements:
 - the subject/the observable object
 - the observer(s), which watch the object

*Note:* Prior to Java 9 there was the [`Observer`/`Observable` classes](https://docs.oracle.com/javase/9/docs/api/java/util/Observable.html#:~:text=Class%20Observable&text=Deprecated.,for%2Done%20correspondence%20with%20notifications.), but have since been deprecated, since they did not log enough information on the updates on the subject. Instead, it is recommended to use `PropertyChangeListener` and `PropertyChangeSuppport` classes.

### Exercise 7
A simple social media platform which notifies one's connections when one updates their status, showing that update on their feed.
 - `Connection` represents the connection with another user, with a `status` String field (*observable*)
 - `SocialMediaFeed` represents our feed, with a `statuses` List of String field (*observer*)
 - `Main` which contains the main class. Initially it prints nothing as the elements are not observing each other
### Challenge 7
Use the observer pattern to refactor an app which handles updates in traffic for various cities.
## Pattern 8: The State Pattern
Allows objects to alter their behaviour depending on their state (e.g. play/pause button) simplifying the otherwise required if/else blocks we could use for this issue.

The `state` is seperated out from the client and is usually an interface, with concrete implementations for different states, which handle the behaviour based on the different state of the item.
### Exercise 8
We implement a media player app with the state pattern.
The `MediaPlayer` class contain the fields `state` and `icon` & the `Main` class handles the changes.

We create the `State` interface and we define the `pause()` and `play()` methods, with a `MediaPlayer` argument each. We then implement the `PlayingState` and the `PausedState`. We add a `State` field to the `MediaPlayer` class & also alter the `play()` & `pause()` methods.
### Challenge 8
Similarly, refactor an app handling a fan's temperature. Note that the fan cannot go from low to high immediately, meaning we need to use the medium setting in between.
## Pattern 9: The Strategy Pattern
### Exercise 9
### Challenge 9

## Pattern 10: The Template Method Pattern
### Exercise 10
### Challenge 10

## Pattern 11: The Visitor Pattern
### Exercise 11
### Challenge 11