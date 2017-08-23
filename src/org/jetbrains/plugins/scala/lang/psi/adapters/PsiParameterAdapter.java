package org.jetbrains.plugins.scala.lang.psi.adapters;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiParameter;
import org.jetbrains.annotations.NotNull;

/**
 * Nikolay.Tropin
 * 23-Aug-17
 */
public interface PsiParameterAdapter extends PsiParameter, PsiModifierListOwnerAdapter {
    @NotNull
    @Override
    default PsiAnnotation[] getAnnotations() {
        return psiAnnotations();
    }
}
