package fr.emse.ai.search.simple;

import fr.emse.ai.search.core.Problem;

import java.util.ArrayList;
import java.util.Collection;

public class CanibalOrientedGraphProblem implements Problem {

    CanibalState initialState = new CanibalState(CanibalState.AG);
    CanibalState finalState = new CanibalState(CanibalState.F);

    @Override
    public Object getInitialState() {
        return initialState;
    }

    @Override
    public boolean isGoal(Object state) {
        return state.equals(finalState);
    }

    @Override
    public Collection<Object> getActions(Object state) {
        ArrayList<Object> actions = new ArrayList<Object>();
        String s = ((CanibalState) state).value;
        if (s.equals(CanibalState.AG)) {
            actions.add("go to BD");
            actions.add("go to CD");
            actions.add("go to DD");
        }
        else if (s.equals(CanibalState.GD)) {
            actions.add("go to BG");
            actions.add("go to DG");
                 }
        else if (s.equals(CanibalState.IG)) {
            actions.add("go to F");
        }
        else if (s.equals(CanibalState.ID)) {
            actions.add("go to ED");
        }
        else if (s.equals(CanibalState.JG)) {
            actions.add("go to F");
        }
        else if (s.equals(CanibalState.JD)) {
            actions.add("go to CG");
        }
        else if (s.equals(CanibalState.HG)) {
            actions.add("go to BD");
            actions.add("go to DG");
        }
        else if (s.equals(CanibalState.BG)) {
            actions.add("go to CD");
            actions.add("go to DD");
            actions.add("go to GD");
        } else if (s.equals(CanibalState.BD)) {
            actions.add("go to AG");
        } else if (s.equals(CanibalState.CG)) {
            actions.add("go to ED");
            actions.add("go to JD");

        } else if (s.equals(CanibalState.CD)) {
            actions.add("go to AG");
            actions.add("go to BG");
        } else if (s.equals(CanibalState.DG)) {
            actions.add("go to ED");
            actions.add("go to GD");

        } else if (s.equals(CanibalState.DD)) {
            actions.add("go to AG");
            actions.add("go to BG");
        } else if (s.equals(CanibalState.EG)) {
            actions.add("go to F");
        } else if (s.equals(CanibalState.ED)) {
            actions.add("go to DG");
            actions.add("go to CG");
        } else if (s.equals(SimpleState.F)) {
        }
        return actions;
    }

    @Override
    public Object getNextState(Object state, Object action) {
        if (action.equals("go to AG")) return new CanibalState(CanibalState.AG);
        if (action.equals("go to BG")) return new CanibalState(CanibalState.BG);
        if (action.equals("go to BD")) return new CanibalState(CanibalState.BD);
        if (action.equals("go to CG")) return new CanibalState(CanibalState.CG);
        if (action.equals("go to CD")) return new CanibalState(CanibalState.CD);
        if (action.equals("go to DG")) return new CanibalState(CanibalState.DG);
        if (action.equals("go to DD")) return new CanibalState(CanibalState.DD);
        if (action.equals("go to EG")) return new CanibalState(CanibalState.EG);
        if (action.equals("go to ED")) return new CanibalState(CanibalState.ED);
        if (action.equals("go to GD")) return new CanibalState(CanibalState.GD);
        if (action.equals("go to HG")) return new CanibalState(CanibalState.HG);
        if (action.equals("go to IG")) return new CanibalState(CanibalState.IG);
        if (action.equals("go to ID")) return new CanibalState(CanibalState.ID);
        if (action.equals("go to JG")) return new CanibalState(CanibalState.JG);
        if (action.equals("go to JD")) return new CanibalState(CanibalState.JD);
        if (action.equals("go to F")) return new CanibalState(CanibalState.F);
        return null;
    }

    @Override
    public double getStepCost(Object start, Object action, Object dest) {

        double heur = 0;

        switch (action.toString()) {
            case "go to AG":
                heur = 6;
                break;
            case "go to BG":
                heur = 5;
                break;
            case "go to BD":
                heur = 5;
                break;
            case "go to CG":
                heur = 4;
                break;
            case "go to CD":
                heur = 4;
                break;
            case "go to DG":
                heur = 4;
                break;
            case "go to DD":
                heur = 4;
                break;
            case "go to EG":
                heur = 2;
                break;
            case "go to ED":
                heur = 2;
                break;
            case "go to GD":
                heur = 3;
                break;
            case "go to GG":
                heur = 3;
                break;
            case "go to HG":
                heur = 3;
                break;
            case "go to HD":
                heur = 3;
                break;
            case "go to F":
                heur =0;
                break;

        }

        return 1+heur;
    }
}
