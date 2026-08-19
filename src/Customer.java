public class Customer {
    private String name;
    private boolean membership;

    public Customer(boolean membership, String name) {
        this.membership = membership;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public boolean hasMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
}
