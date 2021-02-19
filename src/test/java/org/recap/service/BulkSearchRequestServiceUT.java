package org.recap.service;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.recap.BaseTestCaseUT;
import org.recap.model.jpa.BulkRequestItemEntity;
import org.recap.model.jpa.InstitutionEntity;
import org.recap.model.search.BulkRequestForm;
import org.recap.repository.jpa.BulkRequestDetailsRepository;
import org.recap.repository.jpa.InstitutionDetailsRepository;
import org.springframework.data.domain.Page;

import static org.junit.Assert.assertNotNull;


public class BulkSearchRequestServiceUT extends BaseTestCaseUT {

    @InjectMocks
    BulkSearchRequestService bulkSearchRequestService;

    @Mock
    BulkRequestForm bulkRequestForm;

    @Mock
    InstitutionDetailsRepository institutionDetailsRepository;

    @Mock
    InstitutionEntity institutionEntity;
    @Mock

    BulkRequestDetailsRepository bulkRequestDetailsRepository;

    @Test
    public void testProcessSearch(){
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByRequestingInstitutionId(Mockito.any(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByBulkRequestNameAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("findByBulkRequestNameAndRequestingInstitutionId");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByBulkRequestNameAndRequestingInstitutionId(Mockito.any(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByPatronIdAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("5");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByPatronIdAndRequestingInstitutionId(Mockito.any(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByIdAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestIdSearch()).thenReturn("5");
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("");
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByIdAndRequestingInstitutionId(Mockito.any(),Mockito.any(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByIdAndBulkRequestNameAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestIdSearch()).thenReturn("5");
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("findByIdAndBulkRequestNameAndRequestingInstitutionId");
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByIdAndBulkRequestNameAndRequestingInstitutionId(Mockito.any(),Mockito.any(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByBulkRequestNameAndPatronIdAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestIdSearch()).thenReturn("");
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("findByIdAndBulkRequestNameAndRequestingInstitutionId");
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("6");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByBulkRequestNameAndPatronIdAndRequestingInstitutionId(Mockito.any(),Mockito.any(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByIdAndPatronIdAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestIdSearch()).thenReturn("5");
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("");
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("6");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByIdAndPatronIdAndRequestingInstitutionId(Mockito.any(),Mockito.any(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

    @Test
    public void testProcessSearchFindByIdAndBulkRequestNameAndPatronIdAndRequestingInstitutionId(){
        Mockito.when(bulkRequestForm.getRequestIdSearch()).thenReturn("5");
        Mockito.when(bulkRequestForm.getRequestNameSearch()).thenReturn("findByIdAndBulkRequestNameAndPatronIdAndRequestingInstitutionId");
        Mockito.when(bulkRequestForm.getPatronBarcodeSearch()).thenReturn("6");
        Mockito.when(bulkRequestForm.getInstitution()).thenReturn("PUL");
        Mockito.when(bulkRequestForm.getPageSize()).thenReturn(1);
        Mockito.when(institutionDetailsRepository.findByInstitutionCode(Mockito.anyString())).thenReturn(institutionEntity);
        Page<BulkRequestItemEntity> bulkRequestItemEntity= PowerMockito.mock(Page.class);
        Mockito.when(bulkRequestDetailsRepository.findByIdAndBulkRequestNameAndPatronIdAndRequestingInstitutionId(Mockito.any(),Mockito.any(),Mockito.anyString(),Mockito.anyString(),Mockito.anyInt())).thenReturn(bulkRequestItemEntity);
        Mockito.when(institutionEntity.getId()).thenReturn(1);
        Page<BulkRequestItemEntity> bulkRequestItemEntities = bulkSearchRequestService.processSearchRequest(bulkRequestForm);
        assertNotNull(bulkRequestItemEntities);
    }

}
