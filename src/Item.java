public class Item {

  private String name;
  private String description;
  private int weight;

  public Item(String name, String description, int weight) {
    this.name = name;
    this.description = description;
    this.weight = weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
    }
  }



