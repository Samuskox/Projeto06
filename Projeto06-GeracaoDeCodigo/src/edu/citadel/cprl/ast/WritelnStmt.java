package edu.citadel.cprl.ast;

import edu.citadel.compiler.CodeGenException;

import java.util.List;

/**
 * The abstract syntax tree node for a writeln statement.
 */
public class WritelnStmt extends OutputStmt {

    /**
     * Construct a writeln statement with the list of expressions.
     */
    public WritelnStmt( List<Expression> expressions ) {
        super( expressions );
    }
    
    // inherited checkConstraints() method is sufficient
    
    @Override
    public void emit() throws CodeGenException {
         
        // <editor-fold defaultstate="collapsed" desc="Implementação">
        super.emit();
        emit("PUTEOL");
        
        // sua implementação aqui

        // </editor-fold>
        
    }
    
}
