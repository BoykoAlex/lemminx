/**
 *  Copyright (c) 2018 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *  Nikolas Komonen <nkomonen@redhat.com> - additions for CDATA and Processing Instruction
 */
package org.eclipse.lsp4xml.dom.parser;

/**
 * XML Scanner state.
 *
 */
public enum ScannerState {
	WithinContent, AfterOpeningStartTag, AfterOpeningEndTag, WithinProlog, WithinDoctype, WithinTag, WithinEndTag,
	WithinComment, AfterAttributeName, BeforeAttributeValue, WithinCDATA, AfterClosingCDATATag, StartCDATATag, AfterPrologOpen, PrologOrPI, WithinPI

}