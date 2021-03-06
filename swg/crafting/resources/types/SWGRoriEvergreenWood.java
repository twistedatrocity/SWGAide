package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGEvergreenSoftWood;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Rori Evergreen Wood"
 *
 * <b>WARNING:</b>
 * This class is generated by SWGResourceClassGenerator.
 * Do not manually modify this class as your changes are
 * erased when the classes are re-generated.
 *
 * @author Steven M. Doyle <shadow@triwizard.net>
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a>
 * aka Chimaera.Zimoon
 */
@SuppressWarnings("all")
public final class SWGRoriEvergreenWood extends SWGEvergreenSoftWood {

  private static final long serialVersionUID = 4712584L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 800, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 0, 500, 0, 0, 0, 1000, 1000, 0, 400, 300};

  private static final SWGRoriEvergreenWood INSTANCE = new SWGRoriEvergreenWood();

  SWGRoriEvergreenWood() { super(); }

  public static SWGRoriEvergreenWood getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 562; }
  public int rcID() { return 595; }
  public String rcName() { return "Rori Evergreen Wood";}
  public String rcToken() { return "roewd";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
