package fr.emse.ai.search.simple;

import fr.emse.ai.search.core.AbstractTreeSearch;
import fr.emse.ai.search.solver.Astar;
import fr.emse.ai.search.solver.BreadthFirstTreeSearch;
import fr.emse.ai.search.solver.DepthFirstGraphSearch;
import fr.emse.ai.search.solver.DepthFirstTreeSearch;

public class SimpleTest {

    public static void main(String[] args) {
        //SimpleNonOrientedGraphProblem p1 = new SimpleNonOrientedGraphProblem();
        CanibalOrientedGraphProblem p1 = new CanibalOrientedGraphProblem();
        //SimpleNonOrientedGraphProblem p1 = new SimpleNonOrientedGraphProblem();
        System.out.println("Solution to problem using depth first : ");
        DepthFirstTreeSearch g1 = new DepthFirstTreeSearch();
        // Astar g1 = new Astar();
        g1.solve(p1).pathToString();
    }
}
