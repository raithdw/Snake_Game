# 🐍 Snake Game (Java Swing)

A simple Snake game built using **Java Swing**, featuring increasing difficulty, restart functionality, and a retry option on game over.  
This project is meant as a learning exercise for basic game loops, event handling, and UI management in Java.

---

## 🎮 Features

- Classic Snake gameplay
- Increasing speed every time the snake eats an apple
- Collision detection (walls + self)
- **Restart button** (always available)
- **Retry button** displayed on Game Over
- Keyboard controls (arrow keys)
- Clean and simple Swing-based UI

---

## 🕹 Controls

- ⬅️ Left Arrow – Move left
- ➡️ Right Arrow – Move right
- ⬆️ Up Arrow – Move up
- ⬇️ Down Arrow – Move down

---

## 🔁 Game Controls

- **Restart button**  
  Resets the game at any time

- **Retry button**  
  Appears after *Game Over* and restarts the game

---

## ⚙️ Game Mechanics

- Initial speed delay: **150 ms**
- Speed increases by **5 ms** after each apple
- Minimum speed delay: **50 ms**
- Snake grows by one segment per apple
- Game ends on:
    - Wall collision
    - Snake colliding with itself

---

## 🧱 Project Structure

    src/
    └── game/
    ├── Board.java // Game logic, rendering, controls
    └── Snake.java // Main window (JFrame)
    └── images/
    ├── head.png
    ├── body.png
    └── food.png

---

## ▶️ How to Run

1. Make sure you have **Java 8+** installed
2. Clone or download the project
3. Ensure the `images` folder exists at:
   src/images/

r
Copy code
4. Run the `Snake` class:

```bash
javac game/Snake.java
java game.Snake
Or simply run it from your IDE (IntelliJ / Eclipse).

```
---
🛠 Technologies Used
Java

Java Swing (JFrame, JPanel, Timer)

AWT (Graphics, KeyEvent)

📌 Possible Improvements
Score counter & high score tracking

Pause / resume feature

Sound effects

Difficulty selection

Wall wrapping mode

Grid rendering

📄 License
This project is open for learning and personal use.
Feel free to modify, improve, or extend it.

Enjoy the game! 🐍🎮

yaml
Copy code

---

If you want, next we can:
- Add **score + best score**
- Add **ENTER key retry**
- Refactor it toward **cleaner OOP**
- Turn it into a **portfolio-ready project**

Just say what you want next 🚀