package core.classes;

public class Item {
    private String name;
    private String description;
    private String price;

    public Item(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        Item first = (Item) obj;
        if(first.name.equals(this.name) && first.description.equals(this.description) && first.price.equals(this.price))
            return true;
        else return false;
    }
}
