import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CertificateService } from './certificate.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'certificate-module';

  constructor(private certificateService: CertificateService) {
    this.getCertificateDetails();
  }

  register(registerForm: NgForm) {
    this.certificateService.registerCertificate(registerForm.value).subscribe(
      (resp: any) => {
        console.log(resp);
        registerForm.reset();
        this.getCertificateDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  getCertificateDetails() {
    this.certificateService.getCetificates().subscribe(
      (resp: any) => {
        console.log(resp);
        this.certificateDetails = resp;
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  certificateDetails = null as any;

  deleteCertificate(certificate: any) {
    this.certificateService.deleteCertificate(certificate.id).subscribe(
      (resp: any) => {
        console.log(resp);
        this.getCertificateDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  certificateToUpdate = {
    id: null as any,
    studentId: null as any,
    certificateName: "",
    issuingOrganization: '',
    issueDate: '',
    expirationDate: '',
    renewalDate: '',
    status: '',
    description: ''
  };

  edit(certificate: any) {
    this.certificateToUpdate = { ...certificate };
  }

  updateCertificate() {
    this.certificateService.updateCertificate(this.certificateToUpdate).subscribe(
      (resp: any) => {
        console.log(resp);
        this.getCertificateDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }
}
