/* ========================================================================
 * Copyright 2014 miso4204
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 miso4204

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.qualifier

*/

package co.edu.uniandes.csw.miso4204.purchase.master.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uniandes.csw.miso4204.purchase.master.logic.ejb.PurchaseMasterLogicService;
import co.edu.uniandes.csw.miso4204.purchase.master.logic.dto.PurchaseMasterDTO;

public abstract class _PurchaseMasterService {

    @Autowired
    protected PurchaseMasterLogicService purchaseMasterLogicService;

    @POST
    public PurchaseMasterDTO createPurchase(PurchaseMasterDTO purchase) {
        return purchaseMasterLogicService.createMasterPurchase(purchase);
    }

    @DELETE
    @Path("{id}")
    public void deletePurchase(@PathParam("id") Long id) {
        purchaseMasterLogicService.deleteMasterPurchase(id);
    }
    
    @GET
    @Path("{id}")
    public PurchaseMasterDTO getPurchase(@PathParam("id") Long id) {
        return purchaseMasterLogicService.getMasterPurchase(id);
    }

    @PUT
    @Path("{id}")
    public void updatePurchase(@PathParam("id") Long id, PurchaseMasterDTO purchase) {
        purchaseMasterLogicService.updateMasterPurchase(purchase);
    }

}
