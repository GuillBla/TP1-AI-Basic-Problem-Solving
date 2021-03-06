package fr.emse.ai.search.core;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: picard (picard@emse.fr)
 * Date: 09/09/15
 * Time: 15:41
 */
public abstract class AbstractGraphSearch implements Search {

    Collection<Node> frontier;
    ArrayList<Object> observed = new ArrayList<Object>();

    public Node solve(Problem problem) {
        // initialize fringe
        System.out.println("Solving...");
        frontier = initFrontier();
        frontier.addAll(expand(new Node(problem.getInitialState()), problem));
        ArrayList<Object> observed = new ArrayList<Object>();
        observed.add(problem.getInitialState());
        System.out.println("Starting frontier is " + frontier);
        boolean done = false;
        Node solution = null;
        while (!done) {
            if (frontier.isEmpty()) {
                System.out.println("No more nodes in frontier => FAILURE");
                done = true;
            } else {
                Node node = chooseLeafNode(frontier, problem);
                    System.out.println("Inspecting node " + node);
                    if (problem.isGoal(node.getState())) {
                        System.out.println("Goal node reached => SUCCESS");
                        solution = node;
                        done = true;
                    } else {
                        frontier.addAll(expand(node, problem));
                        System.out.printf("Expanding node, frontier is " + frontier);
                    }
            }
        }
        return solution;
    }

    public Collection<Node> expand(Node node, Problem problem) {
        Collection<Node> nodes = new ArrayList<Node>();
        Collection<Object> actions = problem.getActions(node.getState());


        for (Object action : actions) {
            Object next = problem.getNextState(node.getState(), action);
            if(!this.observed.contains((next))) {
                nodes.add(new Node(next, node, action, problem.getStepCost(node.getState(), action, next)));
                this.observed.add(new Node(next, node, action, problem.getStepCost(node.getState(), action, next)).getState());
            }
        }
        return nodes;
    }

    public abstract Collection<Node> initFrontier();

    public abstract Node chooseLeafNode(Collection<Node> frontier, Problem problem);
}
