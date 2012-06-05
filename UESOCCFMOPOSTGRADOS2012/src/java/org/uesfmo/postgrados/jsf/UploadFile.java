/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uesfmo.postgrados.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.icefaces.ace.component.fileentry.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author teto
 */
@ManagedBean
@ViewScoped
public class UploadFile {
   public void listener(FileEntryEvent event) {
       System.out.println("ENTROENTROENTROENTROENTROENTROENTROENTROENTROENTROENTROENTROENTROENTROENTRO");
    FileEntry fileEntry = (FileEntry) event.getSource();
    FileEntryResults results = fileEntry.getResults();
    for (FileEntryResults.FileInfo fileInfo : results.getFiles()) {
        if (fileInfo.isSaved()) {
            // Process the file. Only save cloned copies of results or fileInfo
        }
    }}}

