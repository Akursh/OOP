package homeWorkMaster;

import java.util.ArrayList;

public class FamilyTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Person wife, Person husbent) {
        tree.add(new Node(wife, Relationship.wife, husbent));
        tree.add(new Node(husbent, Relationship.husbent, wife));
    }

}
