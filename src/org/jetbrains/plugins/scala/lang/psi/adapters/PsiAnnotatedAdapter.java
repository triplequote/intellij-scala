package org.jetbrains.plugins.scala.lang.psi.adapters;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiAnnotationOwner;
import org.jetbrains.annotations.NotNull;

/**
 * Nikolay.Tropin
 * 22-Aug-17
 */
public interface PsiAnnotatedAdapter extends PsiAnnotationOwner {
    PsiAnnotation[] psiAnnotations();

    @NotNull
    @Override
    default PsiAnnotation[] getAnnotations() {
        return psiAnnotations();
    }
}
