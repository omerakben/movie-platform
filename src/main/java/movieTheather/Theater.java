package movieTheather;

public abstract class Theater {
    private int numberOfSeats;
    private int numberOfRooms;
    private int numberOfRestrooms;
    private boolean hasPopcorn;
    private boolean has3D;
    private boolean hasDrinks;

    public Theater(int numberOfSeats, int numberOfRooms, int numberOfRestrooms, boolean hasPopcorn, boolean has3D, boolean hasDrinks) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfRooms = numberOfRooms;
        this.numberOfRestrooms = numberOfRestrooms;
        this.hasPopcorn = hasPopcorn;
        this.has3D = has3D;
        this.hasDrinks = hasDrinks;
    }//end ctor

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRestrooms() {
        return numberOfRestrooms;
    }

    public void setNumberOfRestrooms(int numberOfRestrooms) {
        this.numberOfRestrooms = numberOfRestrooms;
    }

    public boolean isHasPopcorn() {
        return hasPopcorn;
    }

    public void setHasPopcorn(boolean hasPopcorn) {
        this.hasPopcorn = hasPopcorn;
    }

    public boolean isHas3D() {
        return has3D;
    }

    public void setHas3D(boolean has3D) {
        this.has3D = has3D;
    }

    public boolean isHasDrinks() {
        return hasDrinks;
    }

    public void setHasDrinks(boolean hasDrinks) {
        this.hasDrinks = hasDrinks;
    }
}//end Theatre

