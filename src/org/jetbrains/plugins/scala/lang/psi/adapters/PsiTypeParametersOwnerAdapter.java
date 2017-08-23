package org.jetbrains.plugins.scala.lang.psi.adapters;

import com.intellij.psi.PsiTypeParameter;
import com.intellij.psi.PsiTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;

/**
 * Nikolay.Tropin
 * 22-Aug-17
 */
public interface PsiTypeParametersOwnerAdapter extends PsiTypeParameterListOwner {
    PsiTypeParameter[] psiTypeParameters();

    @NotNull
    @Override
    default PsiTypeParameter[] getTypeParameters() {
        return psiTypeParameters();
    }
}
