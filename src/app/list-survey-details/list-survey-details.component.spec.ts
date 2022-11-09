import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSurveyDetailsComponent } from './list-survey-details.component';

describe('ListSurveyDetailsComponent', () => {
  let component: ListSurveyDetailsComponent;
  let fixture: ComponentFixture<ListSurveyDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListSurveyDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListSurveyDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
