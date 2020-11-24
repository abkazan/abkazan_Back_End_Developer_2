// --== CS400 File Header Information ==--
// Name: Andrew Kazan
// Email: abkazan@wisc.edu
// Team: HC
// TA: Na Li
// Lecturer: Florian
// Notes to Grader: <optional extra notes>
import java.util.Hashtable;

/**
 * room class for project 4. Each room is a node in a graph and has the following variables:
 * - a number
 * - whether or not the room is locked
 * - items in the room stored in a hashtable
 * @author andrewkazan
 *
 */
public class Room {
  private Hashtable<String, String> items = new Hashtable();
  private int number;
  private boolean isUnlocked;
  /**
   * 
   * @param number the number of the room
   */
  public Room(int number) {
    this.number = number;
    this.isUnlocked = false;
  }
  /**
   * unlocks the room
   */
  public void unlock() {
    this.isUnlocked = true;
  }
  /**
   * returns the items in the room
   * @return hashtable of items
   */
  public Hashtable<String, String> getItems() {
    return this.items;
  }
  /**
   * gets the room number
   * @return the room number
   */
  public int getRoomNumber() {
    return this.number;
  }
  /**
   * returns whether or not room is unlocked
   * @return true if unlocked, false otherwise
   */
  public boolean isUnlocked() {
    return this.isUnlocked;
  }
}
