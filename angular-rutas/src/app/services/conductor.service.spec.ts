/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { ConductorService } from './conductor.service';

describe('Service: Conductor', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ConductorService]
    });
  });

  it('should ...', inject([ConductorService], (service: ConductorService) => {
    expect(service).toBeTruthy();
  }));
});
