public class Relative {
    private static Human first;
    private static Human second;
    private static Relation relation;

    public Relative(Human first, Human second, Relation relation) {
        this.first = first;
        this.second = second;
        this.relation = relation;
    }

    public static Human getFirst() {
        return first;
    }

    public static void setFirst(Human first) {
        Relative.first = first;
    }

    public static Human getSecond() {
        return second;
    }

    public static void setSecond(Human second) {
        Relative.second = second;
    }

    public static Relation getRelation() {
        return relation;
    }

    public static void setRelation(Relation relation) {
        Relative.relation = relation;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", first, relation, second);
    }
}
