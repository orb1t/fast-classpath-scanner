package io.github.lukehutch.fastclasspathscanner.issues.issue172;

import java.io.IOException;

import org.junit.Test;

import io.github.lukehutch.fastclasspathscanner.typesignature.MethodTypeSignature;

public class Issue172Test {
    @Test
    public void classAnnotationParameters() throws IOException {
        MethodTypeSignature.parse("<T:Ljava/lang/Object;>(Lcom/xyz/TestC<TT;>;)Lcom/xyz/TestB<TT;>;");
    }
}
