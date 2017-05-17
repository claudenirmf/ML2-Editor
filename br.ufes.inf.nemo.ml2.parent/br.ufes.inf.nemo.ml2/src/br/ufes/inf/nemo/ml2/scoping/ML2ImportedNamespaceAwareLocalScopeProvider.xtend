package br.ufes.inf.nemo.ml2.scoping

import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.naming.QualifiedName
import br.ufes.inf.nemo.ml2.lib.ML2Lib

class ML2ImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	
	// TODO Implement automated library import
	override protected getImplicitImports(boolean ignoreCase) {
		return newArrayList(
			new ImportNormalizer(QualifiedName.create(ML2Lib.UFO_BASE_LIB,"ml2"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(ML2Lib.UFO_ENDURANT_LIB,"ml2"), true, ignoreCase),
			new ImportNormalizer(QualifiedName.create(ML2Lib.UFO_META_LIB,"ml2"), true, ignoreCase))}
	
}