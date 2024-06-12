public class linked_list {
    private ll_knot rootKnot = null;

    linked_list (ll_knot rootKnot) {
        this.rootKnot = rootKnot;
    }

    linked_list () {
        this.rootKnot = new ll_knot();
    }

    linked_list (Object[] data) {

    }

    private ll_knot lastKnot () {
        ll_knot current = rootKnot;
        while (current.getNextKnot() != null) {
            current = current.getNextKnot();
        }
        return current;
    }

    public void addKnot () {
        lastKnot().setNextKnot(new ll_knot());
    }

    public void addKnot (ll_knot nextKnot) {
        lastKnot().setNextKnot(nextKnot);
    }

    public int length () {
        ll_knot current = rootKnot;
        int count = 0;
        while (current.getNextKnot() != null) {
            current = current.getNextKnot();
            count++;
        }
        return count;
    }

    public ll_knot getKnot (int targetKnot) {
        ll_knot current = rootKnot;
        for (int i = 0; i < targetKnot; i++) {
            current = current.getNextKnot();
        }
        return current;
    }

    public void insertKnot (int targetKnot, Object data) {
        ll_knot postKnot = getKnot(targetKnot);
        if (targetKnot == 0) {
            new ll_knot(postKnot, data);
            return;
        }
        ll_knot preKnot = getKnot(targetKnot - 1);
        preKnot.setNextKnot(new ll_knot(postKnot, data));
    }
}
