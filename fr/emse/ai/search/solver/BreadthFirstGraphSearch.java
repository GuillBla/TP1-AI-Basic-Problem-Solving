package fr.emse.ai.search.solver;

import fr.emse.ai.search.core.AbstractGraphSearch;
import fr.emse.ai.search.core.Node;
import fr.emse.ai.search.core.Problem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstGraphSearch extends AbstractGraphSearch {

    @Override
    public Collection<Node> initFrontier() {
        Queue<Node> q = new LinkedList<>();
        return q;
    }

    @Override
    public Node chooseLeafNode(Collection<Node> frontier, Problem problem) {
        return ((Queue<Node>) frontier).remove();
    }

}
