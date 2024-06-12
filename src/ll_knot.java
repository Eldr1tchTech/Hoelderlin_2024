public class ll_knot {
    private ll_knot nextKnot = null;
    private Object knotData = null;

    ll_knot (ll_knot nextKnot, Object knotData) {
        this.nextKnot = nextKnot;
        this.knotData = knotData;
    }

    ll_knot () {}

    public void setData (Object knotData) {
        this.knotData = knotData;
    }

    public void setNextKnot (ll_knot nextKnot) {
        this.nextKnot = nextKnot;
    }

    public Object getData () {
        return knotData;
    }

    public ll_knot getNextKnot () {
        return nextKnot;
    }
}
