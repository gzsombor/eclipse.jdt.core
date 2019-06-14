/*******************************************************************************
 * Copyright (c) 2000, 2018 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.compiler.parser;

/**
 * IMPORTANT NOTE: These constants are dedicated to the internal Scanner implementation.
 * It is mirrored in org.eclipse.jdt.core.compiler public package where it is API.
 * The mirror implementation is using the backward compatible ITerminalSymbols constant
 * definitions (stable with 2.0), whereas the internal implementation uses TerminalTokens
 * which constant values reflect the latest parser generation state.
 */
/**
 * Maps each terminal symbol in the java-grammar into a unique integer.
 * This integer is used to represent the terminal when computing a parsing action.
 *
 * Disclaimer : These constant values are generated automatically using a Java
 * grammar, therefore their actual values are subject to change if new keywords
 * were added to the language (for instance, 'assert' is a keyword in 1.4).
 */
public interface TerminalTokens {

	// special tokens not part of grammar - not autogenerated
	int TokenNameNotAToken = 0,
							TokenNameWHITESPACE = 1000,
							TokenNameCOMMENT_LINE = 1001,
							TokenNameCOMMENT_BLOCK = 1002,
							TokenNameCOMMENT_JAVADOC = 1003;

	int TokenNameIdentifier = 22,
							TokenNameabstract = 52,
							TokenNameassert = 77,
							TokenNameboolean = 100,
							TokenNamebreak = 78,
							TokenNamebyte = 101,
							TokenNamecase = 102,
							TokenNamecatch = 103,
							TokenNamechar = 104,
							TokenNameclass = 67,
							TokenNamecontinue = 79,
							TokenNameconst = 128,
							TokenNamedefault = 73,
							TokenNamedo = 80,
							TokenNamedouble = 105,
							TokenNameelse = 113,
							TokenNameenum = 71,
							TokenNameextends = 87,
							TokenNamefalse = 38,
							TokenNamefinal = 53,
							TokenNamefinally = 112,
							TokenNamefloat = 106,
							TokenNamefor = 81,
							TokenNamegoto = 129,
							TokenNameif = 82,
							TokenNameimplements = 124,
							TokenNameimport = 107,
							TokenNameinstanceof = 17,
							TokenNameint = 108,
							TokenNameinterface = 70,
							TokenNamelong = 109,
							TokenNamenative = 54,
							TokenNamenew = 36,
							TokenNamenull = 39,
							TokenNamepackage = 86,
							TokenNameprivate = 55,
							TokenNameprotected = 56,
							TokenNamepublic = 57,
							TokenNamereturn = 83,
							TokenNameshort = 110,
							TokenNamestatic = 48,
							TokenNamestrictfp = 58,
							TokenNamesuper = 34,
							TokenNameswitch = 51,
							TokenNamesynchronized = 50,
							TokenNamethis = 35,
							TokenNamethrow = 74,
							TokenNamethrows = 121,
							TokenNametransient = 59,
							TokenNametrue = 40,
							TokenNametry = 84,
							TokenNamevoid = 111,
							TokenNamevolatile = 60,
							TokenNamewhile = 75,
							TokenNamemodule = 114,
							TokenNameopen = 115,
							TokenNamerequires = 116,
							TokenNametransitive = 122,
							TokenNameexports = 117,
							TokenNameopens = 118,
							TokenNameto = 125,
							TokenNameuses = 119,
							TokenNameprovides = 120,
							TokenNamewith = 126,
							TokenNameIntegerLiteral = 41,
							TokenNameLongLiteral = 42,
							TokenNameFloatingPointLiteral = 43,
							TokenNameDoubleLiteral = 44,
							TokenNameCharacterLiteral = 45,
							TokenNameStringLiteral = 46,
							TokenNamePLUS_PLUS = 2,
							TokenNameMINUS_MINUS = 3,
							TokenNameEQUAL_EQUAL = 19,
							TokenNameLESS_EQUAL = 12,
							TokenNameGREATER_EQUAL = 13,
							TokenNameNOT_EQUAL = 20,
							TokenNameLEFT_SHIFT = 18,
							TokenNameRIGHT_SHIFT = 14,
							TokenNameUNSIGNED_RIGHT_SHIFT = 16,
							TokenNamePLUS_EQUAL = 88,
							TokenNameMINUS_EQUAL = 89,
							TokenNameMULTIPLY_EQUAL = 90,
							TokenNameDIVIDE_EQUAL = 91,
							TokenNameAND_EQUAL = 92,
							TokenNameOR_EQUAL = 93,
							TokenNameXOR_EQUAL = 94,
							TokenNameREMAINDER_EQUAL = 95,
							TokenNameLEFT_SHIFT_EQUAL = 96,
							TokenNameRIGHT_SHIFT_EQUAL = 97,
							TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL = 98,
							TokenNameOR_OR = 31,
							TokenNameAND_AND = 30,
							TokenNamePLUS = 4,
							TokenNameMINUS = 5,
							TokenNameNOT = 63,
							TokenNameREMAINDER = 9,
							TokenNameXOR = 24,
							TokenNameAND = 21,
							TokenNameMULTIPLY = 8,
							TokenNameOR = 28,
							TokenNameTWIDDLE = 64,
							TokenNameDIVIDE = 10,
							TokenNameGREATER = 15,
							TokenNameLESS = 11,
							TokenNameLPAREN = 23,
							TokenNameRPAREN = 26,
							TokenNameLBRACE = 49,
							TokenNameRBRACE = 33,
							TokenNameLBRACKET = 6,
							TokenNameRBRACKET = 66,
							TokenNameSEMICOLON = 25,
							TokenNameQUESTION = 29,
							TokenNameCOLON = 62,
							TokenNameCOMMA = 32,
							TokenNameDOT = 1,
							TokenNameEQUAL = 72,
							TokenNameAT = 37,
							TokenNameELLIPSIS = 123,
							TokenNameARROW = 99,
							TokenNameCOLON_COLON = 7,
							TokenNameBeginLambda = 47,
							TokenNameBeginIntersectionCast = 65,
							TokenNameBeginTypeArguments = 85,
							TokenNameElidedSemicolonAndRightBrace = 68,
							TokenNameAT308 = 27,
							TokenNameAT308DOTDOTDOT = 127,
							TokenNameBeginCaseExpr = 69,
							TokenNameRestrictedIdentifierYield = 76,
							TokenNameEOF = 61,
							TokenNameERROR = 130;
}
