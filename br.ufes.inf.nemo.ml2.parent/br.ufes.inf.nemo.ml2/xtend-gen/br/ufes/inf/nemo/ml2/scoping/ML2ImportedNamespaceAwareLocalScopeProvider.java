package br.ufes.inf.nemo.ml2.scoping;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ML2ImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(ML2Lib.UFO_BASE_LIB, "ml2");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    QualifiedName _create_1 = QualifiedName.create(ML2Lib.UFO_ENDURANT_LIB, "ml2");
    ImportNormalizer _importNormalizer_1 = new ImportNormalizer(_create_1, true, ignoreCase);
    QualifiedName _create_2 = QualifiedName.create(ML2Lib.UFO_META_LIB, "ml2");
    ImportNormalizer _importNormalizer_2 = new ImportNormalizer(_create_2, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer, _importNormalizer_1, _importNormalizer_2);
  }
}
