package core.basesyntax.strategy;

import core.basesyntax.services.OperationHandler;

public class OperationHandlerPurchaseImpl implements OperationHandler {
    @Override
    public int operate(int balance, int count) {
        return balance - count;
    }
}
