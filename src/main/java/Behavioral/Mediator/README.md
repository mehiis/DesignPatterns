# Assignment 19: Mediator design pattern

This is a simple real-time chat application built using **JavaFX** and utilizing **Mediator design pattern**.
<br>
- `ChatClient`: A GUI window representing a single user in the chat. Handles user input and displays messages.
- `ChatController`: A controller that stands between `ChatClient` and `ChatMediator`.
- `ChatMediator`: Mediator class that manages communication. Holds a HashMap of `controller.id` to `ChatController` instances and forwards messages to the correct recipient.
- `Message`: A simple helper class that stores: `from`, `to` and `message`.

<br>assignment: https://github.com/vesavvo/design_patterns/blob/6e1bbebcd52426f706901f04f986af35234a1fa6/markdown/assignments/mediator.md