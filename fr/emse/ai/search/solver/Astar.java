package fr.emse.ai.search.solver;

import fr.emse.ai.search.core.AbstractGraphSearch;
import fr.emse.ai.search.core.Node;
import fr.emse.ai.search.core.Problem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Astar extends AbstractGraphSearch {

    @Override
    public Collection<Node> initFrontier() {
        Queue<Node> q = new LinkedList<>();
        return q;
    }

    @Override
    public Node chooseLeafNode(Collection<Node> frontier, Problem problem) {
        double mincost = -1;
        double ccost;
        Node bestnode = null;
        for (Node node : frontier) {
            if (mincost == -1) {
                mincost = node.getPathCost();
                bestnode = node;
            }
            ccost = node.getPathCost();
            if (ccost < mincost) {
                mincost = ccost;
                bestnode = node;
            }
        }
        frontier.remove(bestnode);
        return bestnode;
    }

}