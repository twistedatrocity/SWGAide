package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCrystallineGemstone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Green Diamond Crystalline Gemstone"
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
public final class SWGGreenDiamondCrystallineGemstone extends SWGCrystallineGemstone {

  private static final long serialVersionUID = 1193969L;

  private static final int[] minStats = {0, 213, 213, 606, 0, 764, 86, 1, 0, 449, 449};
  private static final int[] maxStats = {0, 413, 413, 706, 0, 824, 166, 1000, 0, 589, 589};

  private static final SWGGreenDiamondCrystallineGemstone INSTANCE = new SWGGreenDiamondCrystallineGemstone();

  SWGGreenDiamondCrystallineGemstone() { super(); }

  public static SWGGreenDiamondCrystallineGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 762; }
  public int rcID() { return 150; }
  public String rcName() { return "Green Diamond Crystalline Gemstone";}
  public String rcToken() { return "gdcry";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
