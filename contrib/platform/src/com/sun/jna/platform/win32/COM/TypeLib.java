/* Copyright (c) 2012 Tobias Wolf, All Rights Reserved
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */
package com.sun.jna.platform.win32.COM;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.Guid.GUID;
import com.sun.jna.platform.win32.OaIdl.MEMBERID;
import com.sun.jna.platform.win32.OaIdl.TLIBATTR;
import com.sun.jna.platform.win32.OaIdl.TYPEKIND;
import com.sun.jna.platform.win32.WTypes.BSTRByReference;
import com.sun.jna.platform.win32.WTypes.LPOLESTR;
import com.sun.jna.platform.win32.WinDef.BOOLbyReference;
import com.sun.jna.platform.win32.WinDef.DWORDbyReference;
import com.sun.jna.platform.win32.WinDef.UINT;
import com.sun.jna.platform.win32.WinDef.ULONG;
import com.sun.jna.platform.win32.WinDef.USHORTbyReference;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

// TODO: Auto-generated Javadoc
/**
 * Wrapper class for the ITypeLib interface.
 * 
 * @author Tobias Wolf, wolf.tobias@gmx.net
 */
public class TypeLib extends Unknown implements ITypeLib {

    public static class ByReference extends TypeLib implements
	    Structure.ByReference {
    }

    private ITypeLib iTypeLib;

    /**
     * Instantiates a new i type lib.
     */
    public TypeLib() {
	this.iTypeLib = (ITypeLib) this.createCOMClass(ITypeLib.class);
    }

    /**
     * Instantiates a new i type lib.
     * 
     * @param pvInstance
     *            the pv instance
     */
    public TypeLib(Pointer pvInstance) {
	super(pvInstance);
	this.iTypeLib = (ITypeLib) this.createCOMClass(ITypeLib.class);
    }

    /**
     * Gets the type info count.
     * 
     * @return the uint
     */
    public UINT GetTypeInfoCount() {
	return this.iTypeLib.GetTypeInfoCount();
    }

    /**
     * Gets the type info.
     * 
     * @param index
     *            the index
     * @param pTInfo
     *            the t info
     * @return the hresult
     */
    public HRESULT GetTypeInfo(
    /* [in] */UINT index,
    /* [out] */PointerByReference pTInfo) {

	return this.iTypeLib.GetTypeInfo(index, pTInfo);
    }

    /**
     * Gets the type info type.
     * 
     * @param index
     *            the index
     * @param pTKind
     *            the t kind
     * @return the hresult
     */
    public HRESULT GetTypeInfoType(
    /* [in] */UINT index,
    /* [out] */TYPEKIND.ByReference pTKind) {

	return this.iTypeLib.GetTypeInfoType(index, pTKind);
    }

    /**
     * Gets the type info of guid.
     * 
     * @param guid
     *            the guid
     * @param pTinfo
     *            the tinfo
     * @return the hresult
     */
    public HRESULT GetTypeInfoOfGuid(
    /* [in] */GUID guid,
    /* [out] */PointerByReference pTinfo) {

	return this.iTypeLib.GetTypeInfoOfGuid(guid, pTinfo);
    }

    /**
     * Gets the lib attr.
     * 
     * @param ppTLibAttr
     *            the pp t lib attr
     * @return the hresult
     */
    public HRESULT GetLibAttr(
    /* [out] */PointerByReference ppTLibAttr) {

	return this.iTypeLib.GetLibAttr(ppTLibAttr);
    }

    /**
     * Gets the type comp.
     * 
     * @param pTComp
     *            the t comp
     * @return the hresult
     */
    public HRESULT GetTypeComp(
    /* [out] */PointerByReference pTComp) {

	return this.iTypeLib.GetTypeComp(pTComp);
    }

    /**
     * Gets the documentation.
     * 
     * @param index
     *            the index
     * @param pBstrName
     *            the bstr name
     * @param pBstrDocString
     *            the bstr doc string
     * @param pdwHelpContext
     *            the pdw help context
     * @param pBstrHelpFile
     *            the bstr help file
     * @return the hresult
     */
    public HRESULT GetDocumentation(
    /* [in] */int index,
    /* [out] */BSTRByReference pBstrName,
    /* [out] */BSTRByReference pBstrDocString,
    /* [out] */DWORDbyReference pdwHelpContext,
    /* [out] */BSTRByReference pBstrHelpFile) {

	return this.iTypeLib.GetDocumentation(index, pBstrName, pBstrDocString,
		pdwHelpContext, pBstrHelpFile);
    }

    /**
     * Checks if is name.
     * 
     * @param szNameBuf
     *            the sz name buf
     * @param lHashVal
     *            the l hash val
     * @param pfName
     *            the pf name
     * @return the hresult
     */
    public HRESULT IsName(
    /* [annotation][out][in] */
    LPOLESTR szNameBuf,
    /* [in] */ULONG lHashVal,
    /* [out] */BOOLbyReference pfName) {

	return this.iTypeLib.IsName(szNameBuf, lHashVal, pfName);
    }

    /**
     * Find name.
     * 
     * @param szNameBuf
     *            the sz name buf
     * @param lHashVal
     *            the l hash val
     * @param ppTInfo
     *            the pp t info
     * @param rgMemId
     *            the rg mem id
     * @param pcFound
     *            the pc found
     * @return the hresult
     */
    public HRESULT FindName(
    /* [annotation][out][in] */
    BSTRByReference szNameBuf,
    /* [in] */ULONG lHashVal,
    /* [length_is][size_is][out] */ITypeInfo[] ppTInfo,
    /* [length_is][size_is][out] */MEMBERID[] rgMemId,
    /* [out][in] */USHORTbyReference pcFound) {

	return this.iTypeLib.FindName(szNameBuf, lHashVal, ppTInfo, rgMemId,
		pcFound);
    }

    /**
     * Release t lib attr.
     * 
     * @param pTLibAttr
     *            the t lib attr
     */
    public void ReleaseTLibAttr(/* [in] */TLIBATTR pTLibAttr) {
	this.iTypeLib.ReleaseTLibAttr(pTLibAttr);
    }
}