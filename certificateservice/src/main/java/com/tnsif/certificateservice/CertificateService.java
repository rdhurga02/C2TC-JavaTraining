package com.tnsif.certificateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    public Certificate createCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public Certificate updateCertificate(Long id, Certificate certificate) {
        if (certificateRepository.existsById(id)) {
            certificate.setId(id);
            return certificateRepository.save(certificate);
        }
        return null;
    }

    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }
}
