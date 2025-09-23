# Calendar Adapter

A simple program demonstrating the **Adapter Design Pattern**.  
It adapts Java's built-in `java.util.Calendar` to a custom time management system,  
allowing clients to **set**, **get**, and **advance** through time in days.

## Components
- `NewDateInterface`: Custom time management interface
- `CalendarToNewDateAdapter`: concrete adapter implementing `NewDateInterface`
- `Main`: Client code demonstrating usage

<br/><br/>
Assignment: https://github.com/vesavvo/design_patterns/blob/6e1bbebcd52426f706901f04f986af35234a1fa6/markdown/assignments/adapter.md