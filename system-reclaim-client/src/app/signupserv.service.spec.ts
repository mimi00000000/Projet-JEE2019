import { TestBed } from '@angular/core/testing';


import { SignupservService } from './signupserv.service';

describe('SignupservService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SignupservService = TestBed.get(SignupservService);
    expect(service).toBeTruthy();
  });
});
